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
        
        Alien alien = new Alien();
        alien.setAid(101);
        alien.setAname("Snigdha");
        alien.setColor("bown");
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sf = con.buildSessionFactory();
        		
        Session session = sf.openSession();
        
        org.hibernate.Transaction tx = session.beginTransaction();
        session.save(alien);
        tx.commit();
        
    }
}
