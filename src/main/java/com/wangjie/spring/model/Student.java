package com.wangjie.spring.model;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import javax.persistence.*;
import java.io.Serializable;
/**
 * Created by 26297 on 2016/12/29.
 */
@Data
@Entity
@Table(name="school")
@Alias("student")
public class Student implements Serializable{

	@Id
	@GeneratedValue(generator = "uuid")
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	@Column(name = "password")
	private String password;

	@Column(name = "email")
	private String email;

}
