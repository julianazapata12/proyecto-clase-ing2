package academic.service.assembler.implementation;

import academic.domain.StudentCourseStateDomain;
import academic.dto.StudentCourseStateDTO;
import academic.entity.StudentCourseStateEntity;
import academic.service.assembler.Assembler;

public class StudentCourseStateAssembler implements Assembler<StudentCourseStateDomain, StudentCourseStateDTO, StudentCourseStateEntity> {

	private static final Assembler<StudentCourseStateDomain, StudentCourseStateDTO, StudentCourseStateEntity> INSTANCE = new StudentCourseStateAssembler();

	private StudentCourseStateAssembler() {
		super();
	}

	public static Assembler<StudentCourseStateDomain, StudentCourseStateDTO, StudentCourseStateEntity> getStudentCourseStateAssembler() {
		return INSTANCE;
	}

	@Override
	public StudentCourseStateDTO convertDomainToDTO(StudentCourseStateDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentCourseStateEntity convertDomainToEntity(StudentCourseStateDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentCourseStateDomain convertDTOToDomain(StudentCourseStateDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentCourseStateDomain convertEntityToDomain(StudentCourseStateEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
