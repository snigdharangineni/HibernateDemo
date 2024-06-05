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
        		
        Session session1 = sf.openSession();
        
        org.hibernate.Transaction tx = session1.beginTransaction();

        //session1.save(alien);
        alien = session1.get(Alien.class, 110);
        tx.commit();
        
        System.out.println(alien);
        session1.close();
        
        Session session2 = sf.openSession();
        session2.beginTransaction();
        alien = session2.get(Alien.class, 110);
        System.out.println(alien);
        session2.close();
        
    }
}
