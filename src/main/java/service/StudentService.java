package service;

import dto.College;
import dto.Student;
import org.apache.commons.beanutils.BeanUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.SessionUtil;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Date;

@Path("/student")
public class StudentService {

    @GET
    @Path("/find/{param}")
    //@Produces(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_JSON)
    public Student findStudentBasedOnId(@PathParam("param") Integer id){
        Student s = null;
        Student s1 = new Student();
        try{
            Session session = SessionUtil.getSession();
            s = (Student) session.load(Student.class, id);
            BeanUtils.copyProperties(s1, s);
            System.out.println("s1.getStudentName()---findStudentBasedOnId---->"+s1.getStudentName());
            College c = new College();
            c.setName("ASCET");
            //s1.setCollege(c);
        }catch (Exception e){
            e.printStackTrace();
        }
        return s1;
    }
	
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	public void createStudent(Student student){
		System.out.println("############### createStudent begin");
		Session session = SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		session.save(student);
		transaction.commit();
        System.out.println("createStudent---------->"+student.getStudentName());
	}

}
