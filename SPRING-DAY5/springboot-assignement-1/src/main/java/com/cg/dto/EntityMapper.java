package com.cg.dto;

import com.cg.entity.Trainee;

public class EntityMapper {
	
	public static TraineeDTO toDTO(Trainee t) {
      
        return new TraineeDTO(t.getTraineeId(),t.getTraineeName(),t.getTraineeDomain(),t.getTraineeLocation());
    }

    public static Trainee toEntity(TraineeDTO dto) {

        return new Trainee(dto.getTraineeName(),dto.getTraineeDomain(),dto.getTraineeLocation());
    }

}
