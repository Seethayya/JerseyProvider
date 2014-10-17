package test;

import dto.Student;
import org.springframework.web.client.RestTemplate;

/**
 * User: ANISH
 * Date: 9/23/12
 * Time: 12:24 PM
 */
public class ClientTest {
    public static void main(String[] args) {
        ClientTest clientTest = new ClientTest();
        Student student = clientTest.getStudent(6);
        System.out.println(student.getStudentName());
        System.out.println("#######################");
        /*Student s = new Student(11,"Hanuman","nlr",new Date());
        clientTest.storeStudent(s);*/
        System.out.println("### SUCCESS ###");
    }

    public Student getStudent(int id) {
        Student s = null;
        try{
            RestTemplate restTemplate = new RestTemplate();
            //s = restTemplate.getForObject("http://localhost:8082/JerseyPeovidder/student/find/"+id, Student.class);
            s = restTemplate.getForObject("http://localhost:8082/JerseyPeovidder/student/find/"+id, Student.class);
            System.out.println(s.getStudentName());
            //s = c.resource("http://localhost:8082/JerseyPeovidder/student/find/"+id).post(Student.class);
            //Client client = Client.create();
            //s = client.resource("http://localhost:8082/JerseyPeovidder/student/find/"+id).accept(MediaType.APPLICATION_JSON).get(Student.class);
        }catch (Exception e){
            e.printStackTrace();
        }
        return s;

    }

    public void storeStudent(Student student) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForLocation("http://localhost:8082/JerseyPeovidder/student/create", student);
    }

}
