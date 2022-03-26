package com.apiTask;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Task {

	public void createPost() {

		System.out.println("post........");

		Response response = RestAssured.given().header("content-Type", "application/json").auth().preemptive()
				.basic("rajavelraja25@gmail.com", "g67mhTz2iXyJCp1ox6LaF4CC")
				.body("	{\r\n" + "    \"fields\": {\r\n" + "       \"project\":\r\n" + "       {\r\n"
						+ "          \"key\": \"FAC\"\r\n" + "       },\r\n"
						+ "       \"summary\": \"REST ye merry gentlemen.\",\r\n"
						+ "       \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
						+ "       \"issuetype\": {\r\n" + "          \"name\": \"Epic\"\r\n" + "       }\r\n"
						+ "   }\r\n" + "}")
				.post("https://rajavel25.atlassian.neT/rest/api/2/issue/");
		System.out.println(response.getStatusCode());

		String asPrettyString = response.getBody().asPrettyString();
		System.out.println(asPrettyString);

	}
	
	
	public void deleteIssue() {
		
		System.out.println("delete.........");

		Response response = RestAssured.given().header("content-Type", "application/json").auth().preemptive()
				.basic("rajavelraja25@gmail.com", "g67mhTz2iXyJCp1ox6LaF4CC").body("	{\r\n" + "   \"fields\": {\r\n"
						+ "       \"assignee\":{\"name\":\"charlie\"}\r\n" + "   }\r\n" + "}")
				.delete("https://rajavel25.atlassian.neT/rest/api/2/issue/FAC-13");
		System.out.println(response.getStatusCode());

		String asPrettyString = response.getBody().asPrettyString();
		System.out.println(asPrettyString);

		
	}

	public void updateIssue() {

		System.out.println("put.........");

		Response response = RestAssured.given().header("content-Type", "application/json").auth().preemptive()
				.basic("rajavelraja25@gmail.com", "g67mhTz2iXyJCp1ox6LaF4CC").body("	{\r\n" + "   \"fields\": {\r\n"
						+ "       \"assignee\":{\"name\":\"charlie\"}\r\n" + "   }\r\n" + "}")
				.put("https://rajavel25.atlassian.neT/rest/api/2/issue/FAC-10");
		System.out.println(response.getStatusCode());

		String asPrettyString = response.getBody().asPrettyString();
		System.out.println(asPrettyString);

	}
	
	public void get() {

		System.out.println("get.........");

		Response response = RestAssured.given().header("content-Type", "application/json").auth().preemptive()
				.basic("rajavelraja25@gmail.com", "g67mhTz2iXyJCp1ox6LaF4CC").body("	{\r\n" + "   \"fields\": {\r\n"
						+ "       \"assignee\":{\"name\":\"charlie\"}\r\n" + "   }\r\n" + "}")
				.get("https://rajavel25.atlassian.neT/rest/api/2/issue/FAC-17");
		System.out.println(response.getStatusCode());

		String asPrettyString = response.getBody().asPrettyString();
		System.out.println(asPrettyString);
	
	
	}
	
	

	public static void main(String[] args) {

		Task task = new Task();

		task.createPost();
		task.updateIssue();
		task.get();
		task.deleteIssue();

	}
}
