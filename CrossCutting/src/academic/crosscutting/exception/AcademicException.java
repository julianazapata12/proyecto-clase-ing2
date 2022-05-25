package academic.crosscutting.exception;

import academic.crosscutting.exception.enums.LocationExceptionEnum;
import academic.crosscutting.exception.enums.TypeExceptionEnum;

public class AcademicException extends RuntimeException {

	private static final long serialVersionUID = -8150922047169431586L;
	private TypeExceptionEnum type;
	private LocationExceptionEnum location;
	private String message;
	private Exception rootException;

	private AcademicException(TypeExceptionEnum type, LocationExceptionEnum location, String message, Exception rootException) {
		super();
		setType(type);
		setLocation(location);
		setMessage(message);
		setRootException(rootException);
	}

	public static AcademicException buildTechnicalServiceException(String message) {
		return new AcademicException(TypeExceptionEnum.TECHNICAL, LocationExceptionEnum.SERVICE, message, null);
	}

	public static AcademicException buildBusinessServiceException(String message) {
		return new AcademicException(TypeExceptionEnum.BUSINESS, LocationExceptionEnum.SERVICE, message, null);
	}

	public TypeExceptionEnum getType() {
		return type;
	}

	private void setType(TypeExceptionEnum type) {
		this.type = (type == null) ? TypeExceptionEnum.getDefault() : type;
	}

	public LocationExceptionEnum getLocation() {
		return location;
	}

	private void setLocation(LocationExceptionEnum location) {
		this.location = (location == null) ? LocationExceptionEnum.getDefault() : location;
	}

	public String getMessage() {
		return message;
	}

	private void setMessage(String message) {
		this.message = (message == null) ? "" : message.trim();
	}

	public Exception getRootException() {
		return rootException;
	}

	private void setRootException(Exception rootException) {
		this.rootException = (rootException == null) ? new Exception() : rootException;
	}
}