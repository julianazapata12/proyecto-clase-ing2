package academic.service.assembler.implementation;

import academic.domain.StudentDomain;
import academic.dto.StudentDTO;
import academic.entity.StudentEntity;
import academic.service.assembler.Assembler;

public class StudentAssembler implements Assembler<StudentDomain, StudentDTO, StudentEntity> {

	private static final Assembler<StudentDomain, StudentDTO, StudentEntity> INSTANCE = new StudentAssembler();

	private StudentAssembler() {
		super();
	}

	public static Assembler<StudentDomain, StudentDTO, StudentEntity> getStudentAssembler() {
		return INSTANCE;
	}

	@Override
	public StudentDTO convertDomainToDTO(StudentDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentEntity convertDomainToEntity(StudentDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentDomain convertDTOToDomain(StudentDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentDomain convertEntityToDomain(StudentEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
