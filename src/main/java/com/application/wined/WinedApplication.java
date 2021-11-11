package com.application.wined;

import com.application.wined.entity.Wine;
import com.application.wined.repository.WineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WinedApplication implements CommandLineRunner
{

	public static void main(String[] args)
	{
		SpringApplication.run(WinedApplication.class, args);
	}

	@Autowired
	private WineRepository wineRepository;

	@Override
	public void run(String... args) throws Exception
	{
		Wine wine = new Wine();
	}
}
