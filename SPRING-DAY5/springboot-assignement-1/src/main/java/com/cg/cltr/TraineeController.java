package com.cg.cltr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dto.TraineeDTO;
import com.cg.service.ITraineeService;

@RestController
@RequestMapping("api/trainees")
public class TraineeController {
	
	@Autowired
	private ITraineeService ts;
	
//	@GetMapping("trainees")
    @GetMapping(produces={"application/json", "application/xml"})
    public List<TraineeDTO> getTrainee(){
        return ts.getAll();
    }
    
    @PostMapping(consumes={"application/json", "application/xml"})
    public TraineeDTO createTrainee(@RequestBody TraineeDTO trs){
        return ts.create(trs);
    }
    
    @GetMapping("/{traineeId}")
    public ResponseEntity<TraineeDTO> getTraineebyId(@PathVariable int traineeId){
        TraineeDTO t=ts.getById(traineeId);
        if(t!=null){
            return new ResponseEntity<TraineeDTO>(t, HttpStatus.OK);
        }
        else return new ResponseEntity<TraineeDTO>((TraineeDTO) null, HttpStatus.NOT_FOUND);
    }
    
    @PutMapping
    public TraineeDTO updateTrainee(@RequestBody TraineeDTO t){
        return ts.update(t);
    }
    
    @DeleteMapping("/{traineeId}")
    public String removeTraineeById(@PathVariable int traineeId){
        return ts.delete(traineeId);
    }
    
    @GetMapping("/name/{name}")
    public List<TraineeDTO> getTraByName(@PathVariable String name){
    	return ts.getByName(name);
    }

}
