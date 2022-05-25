package academic.service.assembler.implementation;

import academic.domain.StudentCourseDomain;
import academic.dto.StudentCourseDTO;
import academic.entity.StudentCourseEntity;
import academic.service.assembler.Assembler;

public class StudentCourseAssembler implements Assembler<StudentCourseDomain, StudentCourseDTO, StudentCourseEntity> {

	private static final Assembler<StudentCourseDomain, StudentCourseDTO, StudentCourseEntity> INSTANCE = new StudentCourseAssembler();

	private StudentCourseAssembler() {
		super();
	}

	public static Assembler<StudentCourseDomain, StudentCourseDTO, StudentCourseEntity> getStudentCourseAssembler() {
		return INSTANCE;
	}

	@Override
	public StudentCourseDTO convertDomainToDTO(StudentCourseDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentCourseEntity convertDomainToEntity(StudentCourseDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentCourseDomain convertDTOToDomain(StudentCourseDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentCourseDomain convertEntityToDomain(StudentCourseEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
