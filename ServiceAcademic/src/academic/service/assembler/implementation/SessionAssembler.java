package academic.service.assembler.implementation;

import academic.domain.SessionDomain;
import academic.dto.SessionDTO;
import academic.entity.SessionEntity;
import academic.service.assembler.Assembler;

public class SessionAssembler implements Assembler<SessionDomain, SessionDTO, SessionEntity> {

	private static final Assembler<SessionDomain, SessionDTO, SessionEntity> INSTANCE = new SessionAssembler();

	private SessionAssembler() {
		super();
	}

	public static Assembler<SessionDomain, SessionDTO, SessionEntity> getSessionAssembler() {
		return INSTANCE;
	}

	@Override
	public SessionDTO convertDomainToDTO(SessionDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SessionEntity convertDomainToEntity(SessionDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SessionDomain convertDTOToDomain(SessionDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SessionDomain convertEntityToDomain(SessionEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
