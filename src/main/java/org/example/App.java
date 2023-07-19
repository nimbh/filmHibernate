package org.example;

import org.example.model.Director;
import org.example.model.Film;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Director.class)
                .addAnnotatedClass(Film.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

            //получение фильмов режиссера
//           Director director = session.get(Director.class, 3);
//            List<Film> films = director.getFilms();
//            System.out.println(director);
//            System.out.println(films);

            //получение режиссера по фильму
//            Film film = session.get(Film.class, 6);
//            System.out.println(film);
//            Director d = film.getDirector();
//            System.out.println(d);

            //добавление фильма режиссеру
//            Director director = session.get(Director.class, 1);
//            Film filmNew = new Film("Десять ночей", 1990, director);
//            director.getFilms().add(filmNew);
//            System.out.println(director.getFilms());
//            session.save(filmNew);

            //Создайте нового режиссера и новый фильм и свяжите эти сущности
//            Director d = new Director("Шестаков Иван", 1984);
//            Film f = new Film("Белые ночи", 2019, d);
//            d.setFilms(new ArrayList<>(Collections.singleton(f)));
//            session.save(d);
//            session.save(f);

            //Смените режиссера у существующего фильма
//            Film film = session.get(Film.class, 4);
//            Director director = session.get(Director.class, 5);
//            film.setDirector(director);
//            System.out.println(film.getDirector());

            //Удалите фильм у любого режиссера
//            Director director = session.get(Director.class, 1);
//            Film film = session.get(Film.class, 3);
//            session.remove(film);
//            director.getFilms().remove(film.getId());

            //Удалить режиссера (только убрать ограничение NOT NULL)
//            Director director = session.get(Director.class, 3);
//            session.remove(director);
//            director.getFilms().forEach(f -> f.setDirector(null));
            
            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }

    }
}
