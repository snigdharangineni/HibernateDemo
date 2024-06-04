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
        alien.setAid(103);
        alien.setAname("Rush");
        alien.setColor("Brown");
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sf = con.buildSessionFactory();
        		
        Session session = sf.openSession();
        
        org.hibernate.Transaction tx = session.beginTransaction();
        session.save(alien);
        tx.commit();
        
    }
}
