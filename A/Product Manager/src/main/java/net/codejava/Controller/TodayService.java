package net.codejava.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.Model.Today;
import net.codejava.View.TodayRepository;

@Service
public class TodayService {

	@Autowired
	private TodayRepository repo;
	
	
	public List<Today> listAll()
	{
		
		return repo.findAll();
	}
	
	public void save(Today t)
	{
		repo.save(t);
	}
	
	public Today get(Long id)
	{
		return repo.findById(id).get();
	}
	
	public void delete(Long id)
	{
		repo. deleteById(id);
	}
	
	public List<Today> search(String keyword)
	{
		return repo.search(keyword);
	}
	
}
