package com.cg.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ITraineeRepo;
import com.cg.dto.EntityMapper;
import com.cg.dto.TraineeDTO;
import com.cg.entity.Trainee;

@Service
public class TraineeService implements ITraineeService{
	
	@Autowired
	private ITraineeRepo trepo;

	@Override
	public List<TraineeDTO> getAll() {
		// TODO Auto-generated method stub
		List<Trainee> trs = trepo.findAll();
		List<TraineeDTO> tdtos=new ArrayList<TraineeDTO>();
		trs.forEach(t->tdtos.add(EntityMapper.toDTO(t)));
		return tdtos;
	}

	@Override
	public TraineeDTO getById(int id) {
		// TODO Auto-generated method stub
		Optional<Trainee> existing=trepo.findById(id);
        if(existing.isPresent()){
            return EntityMapper.toDTO(existing.get());
        }
        return null;
	}

	@Override
	public List<TraineeDTO> getByName(String name) {
		// TODO Auto-generated method stub
		List<Trainee> list = trepo.findByTraineeName(name);
        List<TraineeDTO> dtos = new ArrayList<TraineeDTO>();
        list.forEach(t -> dtos.add(EntityMapper.toDTO(t)));
        return dtos;
//		return null;
	}

	@Override
	public TraineeDTO create(TraineeDTO dto) {
		// TODO Auto-generated method stub
		Trainee trs=trepo.saveAndFlush(EntityMapper.toEntity(dto));
		return EntityMapper.toDTO(trs);
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		if (trepo.findById(id).isPresent()) {
            trepo.deleteById(id);
            return "Trainee Deleted !!!";
        }
        return "Trainee Not Found !!";
	}

	@Override
	public TraineeDTO update(TraineeDTO dto) {
		// TODO Auto-generated method stub
		if (trepo.findById(dto.getTraineeId()).isPresent()) {
            Trainee t = trepo.saveAndFlush(EntityMapper.toEntity(dto));
            return EntityMapper.toDTO(t);
        }
        return null;
    }
	
}
