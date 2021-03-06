package net.codejava.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.Model.Upcoming;
import net.codejava.View.UpcomingRepository;


@Service
public class UpcomingService {

	@Autowired
	private UpcomingRepository repo1;
	
	
	public List<Upcoming> listAll()
	{
		
		return repo1.findAll();
	}
	
	public void save(Upcoming u)
	{
		repo1.save(u);
	}
	
	public Upcoming get(Long idu)
	{
		return repo1.findById(idu).get();
	}
	
	public void delete(Long idu)
	{
		repo1. deleteById(idu);
	}
	
}
