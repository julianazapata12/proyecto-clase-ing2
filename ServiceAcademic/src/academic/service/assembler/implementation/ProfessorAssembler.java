package academic.service.assembler.implementation;

import academic.crosscutting.exception.AcademicException;
import academic.domain.ProfessorDomain;
import academic.dto.ProfessorDTO;
import academic.entity.ProfessorEntity;
import academic.service.assembler.Assembler;

public class ProfessorAssembler implements Assembler<ProfessorDomain, ProfessorDTO, ProfessorEntity> {

	private static final Assembler<ProfessorDomain, ProfessorDTO, ProfessorEntity> INSTANCE = new ProfessorAssembler();

	private ProfessorAssembler() {
		super();
	}

	public static Assembler<ProfessorDomain, ProfessorDTO, ProfessorEntity> getProfessorAssembler() {
		return INSTANCE;
	}

	@Override
	public ProfessorDTO convertDomainToDTO(ProfessorDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un ProfessorDomain a un ProfessorDTO cuando el dominio está nulo...";
			throw AcademicException.buildTechnicalServiceException(message);
		}

		return ProfessorDTO.create(domain.getId(), domain.getIdNumber(), IdTypeAssembler.getIdTypeAssembler().convertDomainToDTO(domain.getIdType()), domain.getName(), domain.getEmail());

	}

	@Override
	public ProfessorEntity convertDomainToEntity(ProfessorDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un ProfessorDomain a un ProfessorEntity cuando el dominio está nulo...";
			throw AcademicException.buildTechnicalServiceException(message);
		}

		return ProfessorEntity.create(domain.getId(), domain.getIdNumber(), IdTypeAssembler.getIdTypeAssembler().convertDomainToEntity(domain.getIdType()), domain.getName(), domain.getEmail());
	}

	@Override
	public ProfessorDomain convertDTOToDomain(ProfessorDTO dto) {
		if (dto == null) {
			var message = "No es posible convertir un ProfessorDTO a un ProfessorDomain cuando el dto está nulo...";
			throw AcademicException.buildTechnicalServiceException(message);
		}

		return ProfessorDomain.create(dto.getId(), IdTypeAssembler.getIdTypeAssembler().convertDTOToDomain(dto.getIdType()), dto.getName(), dto.getIdNumber(), dto.getEmail());
	}

	@Override
	public ProfessorDomain convertEntityToDomain(ProfessorEntity entity) {
		if (entity == null) {
			var message = "No es posible convertir un ProfessorEntity a un ProfessorDomain cuando la entidad está nula...";
			throw AcademicException.buildTechnicalServiceException(message);
		}

		return ProfessorDomain.create(entity.getId(), IdTypeAssembler.getIdTypeAssembler().convertEntityToDomain(entity.getIdType()), entity.getName(), entity.getIdNumber(), entity.getEmail());
	}
}