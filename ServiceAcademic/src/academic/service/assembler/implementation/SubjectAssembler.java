package academic.service.assembler.implementation;

import academic.crosscutting.exception.AcademicException;
import academic.domain.SubjectDomain;
import academic.dto.SubjectDTO;
import academic.entity.SubjectEntity;
import academic.service.assembler.Assembler;

public class SubjectAssembler implements Assembler<SubjectDomain, SubjectDTO, SubjectEntity> {

	private static final Assembler<SubjectDomain, SubjectDTO, SubjectEntity> INSTANCE = new SubjectAssembler();

	private SubjectAssembler() {
		super();
	}

	public static Assembler<SubjectDomain, SubjectDTO, SubjectEntity> getSubjectAssembler() {
		return INSTANCE;
	}

	@Override
	public SubjectDTO convertDomainToDTO(SubjectDomain domain) {

		if (domain == null) {
			var message = "No es posible convertir un SubjectDomain a un SubjectDTO cuando el dominio est� nulo...";
			throw AcademicException.buildTechnicalServiceException(message);
		}

		return SubjectDTO.create(domain.getId(), domain.getName());
	}

	@Override
	public SubjectEntity convertDomainToEntity(SubjectDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un SubjectDomain a un SubjectEntity cuando el dominio est� nulo...";
			throw AcademicException.buildTechnicalServiceException(message);
		}

		return SubjectEntity.create(domain.getId(), domain.getName());
	}

	@Override
	public SubjectDomain convertDTOToDomain(SubjectDTO dto) {
		if (dto == null) {
			var message = "No es posible convertir un SubjectDTO a un SubjectDomain cuando el dto est� nulo...";
			throw AcademicException.buildTechnicalServiceException(message);
		}

		return SubjectDomain.create(dto.getId(), dto.getName());
	}

	@Override
	public SubjectDomain convertEntityToDomain(SubjectEntity entity) {
		if (entity == null) {
			var message = "No es posible convertir un SubjectEntity a un SubjectDomain cuando la entidad est� nula...";
			throw AcademicException.buildTechnicalServiceException(message);
		}

		return SubjectDomain.create(entity.getId(), entity.getName());
	}

}
