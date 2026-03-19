package com.cg.service;

import java.util.List;

import com.cg.dto.TraineeDTO;

public interface ITraineeService {
	
	List<TraineeDTO> getAll();

    TraineeDTO getById(int id);

    List<TraineeDTO> getByName(String name);

    TraineeDTO create(TraineeDTO dto);

    String delete(int id);

    TraineeDTO update(TraineeDTO dto);

}
