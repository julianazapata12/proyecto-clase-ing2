package academic.service.assembler.implementation;

import academic.domain.CourseDomain;
import academic.dto.CourseDTO;
import academic.entity.CourseEntity;
import academic.service.assembler.Assembler;

public class CourseAssembler implements Assembler<CourseDomain, CourseDTO, CourseEntity> {

	private static final Assembler<CourseDomain, CourseDTO, CourseEntity> INSTANCE = new CourseAssembler();

	private CourseAssembler() {
		super();
	}

	public static Assembler<CourseDomain, CourseDTO, CourseEntity> getCourseAssembler() {
		return INSTANCE;
	}

	@Override
	public CourseDTO convertDomainToDTO(CourseDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CourseEntity convertDomainToEntity(CourseDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CourseDomain convertDTOToDomain(CourseDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CourseDomain convertEntityToDomain(CourseEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
