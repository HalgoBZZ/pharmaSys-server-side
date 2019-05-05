package com.pfe.pharmasys.controller;

import java.util.List;
import java.util.Optional;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.pharmasys.entities.Employee;
import com.pfe.pharmasys.services.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/employee")
public class EmployeeController {

	final String username = "pharmasysad@gmail.com";
	final String password = "pharmasys.admin.123";
	private String code;

	@Autowired
	private EmployeeService service;

	@PostMapping(value = "/add")
	public void addEmployee(@RequestBody Employee employee) {
		service.addEmployee(employee);
	}

	@PutMapping(value = "/update")
	public void updateEmployee(@RequestBody Employee employee) {
		service.updateEmployee(employee);
	}

	@GetMapping(value = "/find/{id}")
	public Optional<Employee> findEmployee(@PathVariable("id") Long id) {
		return service.findEmployee(id);
	}

	@GetMapping(value = "/all")
	public List<Employee> listEmployee() {
		return service.listEmployee();
	}

	@DeleteMapping(value = "/delete/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		service.deleteEmployee(id);
	}

	@GetMapping(value = "/find-by-email/{email}")
	public Optional<Employee> findByEmail(@PathVariable("email") String email) {
		return service.findByEmail(email);
	}

	@GetMapping(value = "/authentication/{login}/{pwd}")
	public Employee authentication(@PathVariable("login") String login, @PathVariable("pwd") String pwd) {
		return service.authentication(login, pwd);
	}

	@GetMapping(value = "/find-by-login/{login}")
	public Employee findByLogin(@PathVariable("login") String login) {
		return service.findByLogin(login);
	}

	@GetMapping(value="/get-by-email-login/{login}/{email}")
	public Employee findByEmailAndLogin(@PathVariable("login") String login, @PathVariable("email") String email) {
		Employee employee = service.findByEmailAndLogin(login, email);
		if (employee != null) {
			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");

			Session session = Session.getInstance(props, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password);
				}
			});
			try {

				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress("pharmasysad@gmail.com"));
				message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(employee.getEmail_emp()));
				message.setSubject("Recuperation de mot de passe");
				code = getSaltString();
				message.setText("Code: " + code);
				Transport.send(message);
			} catch (MessagingException e) {
				throw new RuntimeException(e);
			}
		}
		return employee;
	}

	private String getSaltString() {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 18) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;
	}

	@GetMapping(value="/getcode")
	public Employee getCode() {
		Employee employe = new Employee();
		employe.setNom_emp(code);
		return employe;
	}

}
