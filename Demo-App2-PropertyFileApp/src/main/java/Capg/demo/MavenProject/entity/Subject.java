package Capg.demo.MavenProject.entity;


import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subject 
{


	@Value("${subject.name}")
	private String subjectName;
	@Value("${subject.weight}")
	private int weightage;
	@Value("${trainer.name}")
	private String instructorName;
}