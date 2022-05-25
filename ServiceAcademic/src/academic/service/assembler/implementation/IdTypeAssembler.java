package academic.service.assembler.implementation;

import academic.crosscutting.exception.AcademicException;
import academic.domain.IdTypeDomain;
import academic.dto.IdTypeDTO;
import academic.entity.IdTypeEntity;
import academic.service.assembler.Assembler;

public class IdTypeAssembler implements Assembler<IdTypeDomain, IdTypeDTO, IdTypeEntity> {

	private static final Assembler<IdTypeDomain, IdTypeDTO, IdTypeEntity> INSTANCE = new IdTypeAssembler();

	private IdTypeAssembler() {
		super();
	}

	public static Assembler<IdTypeDomain, IdTypeDTO, IdTypeEntity> getIdTypeAssembler() {
		return INSTANCE;
	}

	@Override
	public IdTypeDTO convertDomainToDTO(IdTypeDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un IdTypeDomain a un IdTypeDTO cuando el dominio está nulo...";
			throw AcademicException.buildTechnicalServiceException(message);
		}

		return IdTypeDTO.create(domain.getId(), domain.getName());
	}

	@Override
	public IdTypeEntity convertDomainToEntity(IdTypeDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un IdTypeDomain a un IdTypeEntity cuando el dominio está nulo...";
			throw AcademicException.buildTechnicalServiceException(message);
		}

		return IdTypeEntity.create(domain.getId(), domain.getName());
	}

	@Override
	public IdTypeDomain convertDTOToDomain(IdTypeDTO dto) {
		if (dto == null) {
			var message = "No es posible convertir un IdTypeDTO a un IdTypeDomain cuando el dto está nulo...";
			throw AcademicException.buildTechnicalServiceException(message);
		}

		return IdTypeDomain.create(dto.getId(), dto.getName());

	}

	@Override
	public IdTypeDomain convertEntityToDomain(IdTypeEntity entity) {
		if (entity == null) {
			var message = "No es posible convertir un IdTypeEntity a un IdTypeDomain cuando la entidad está nula...";
			throw AcademicException.buildTechnicalServiceException(message);
		}

		return IdTypeDomain.create(entity.getId(), entity.getName());
	}

}
