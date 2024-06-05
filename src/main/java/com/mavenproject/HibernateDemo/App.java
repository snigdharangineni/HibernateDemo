package com.mavenproject.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        AlienName an = new AlienName();
        an.setFname("Snigdha");
        an.setMname("Rao");
        an.setLname("Rangineni");
        
        Alien alien = new Alien();
        alien.setAid(110);
        alien.setColor("Dusky");
        alien.setAname(an);
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sf = con.buildSessionFactory();
        		
        Session session = sf.openSession();
        
        org.hibernate.Transaction tx = session.beginTransaction();

        session.save(alien);
        //alien = session.get(Alien.class, 104);
        tx.commit();
        
        System.out.println(alien);
        
    }
}
