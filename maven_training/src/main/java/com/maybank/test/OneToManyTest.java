package com.maybank.test;

import java.util.ArrayList;
import java.util.List;

import com.maybank.dao.Answer;
import com.maybank.dao.Login;
import com.maybank.dao.Question;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToManyTest {

    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sf = configuration.buildSessionFactory();
        // saveQuestionAndAnswers(sf);
        saveQuestionAndAnswersWithCascade(sf);
        getAnswer(sf);
        getQuestion(sf);
        sf.close();

    }

    public static void saveQuestionAndAnswers(SessionFactory sf) {
        Question question = new Question();
        question.setQuestion("Java is platform independent language 2");

        Answer answer1 = new Answer();
        answer1.setAnswer("true 2");
        answer1.setQuestion(question);

        Answer answer2 = new Answer();
        answer2.setAnswer("false 2");
        answer2.setQuestion(question);

        Session session = sf.openSession();
        session.beginTransaction();

        session.persist(question);
        session.persist(answer1);
        session.persist(answer2);

        session.getTransaction().commit();

        session.close();

    }

    public static void getAnswer(SessionFactory sf) {
        Session session = sf.openSession();
        Answer answer1 = session.get(Answer.class, 552);
        Answer answer2 = session.get(Answer.class, 553);
        System.out.println(
                "Answer is " + answer1.getId() + " " + answer1.getAnswer() + " " + answer1.getQuestion().getQuestion());
        System.out.println(
                "Answer is " + answer2.getId() + " " + answer2.getAnswer() + " " + answer2.getQuestion().getQuestion());
        session.close();

    }

    public static void getQuestion(SessionFactory sf) {
        Session session = sf.openSession();
        Question question = session.get(Question.class, 452);
        System.out.println("Question is" + question.getId() + " " + question.getQuestion());
        // System.out.println("Answer from Question " + question.getAnswers());

        for (Answer a : question.getAnswers()) {
            System.out.println("Answer from Question " + a.getId() + " " + a.getAnswer());
        }
        session.close();
    }

    public static void saveQuestionAndAnswersWithCascade(SessionFactory sf) {
        Question question = new Question();
        question.setQuestion("Java is very popular language.");

        Answer answer1 = new Answer();
        answer1.setAnswer("trues 2");
        answer1.setQuestion(question);

        Answer answer2 = new Answer();
        answer2.setAnswer("falses 2");
        answer2.setQuestion(question);

        List<Answer> answerList = new ArrayList<Answer>();
        answerList.add(answer1);
        answerList.add(answer2);

        question.setAnswers(answerList);

        Session session = sf.openSession();
        session.beginTransaction();

        session.persist(question);

        session.getTransaction().commit();

        session.close();

    }

}
