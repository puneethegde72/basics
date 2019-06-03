package puneet;

import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Client {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEid(001);
		emp.setEname("puneet");
		emp.setAddress("rajajinagar");
		System.out.println("employee deatiles:"+emp);
		
		 
		/*
		Resource resource = new ClassPathResource("EmployeeBean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee e1=(Employee)factory.getBean("emp1");
		Employee e2=(Employee)factory.getBean("emp2");
		System.out.println("employee detail of emp1;"+e1);
		System.out.println("employee detail of emp2;"+e2);
		*/
		
	}

}
