package vn.tayjava.exception;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.ConstraintViolationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.io.IOException;
import java.util.Date;

import static org.springframework.http.HttpStatus.*;

@RestControllerAdvice
@Slf4j
public class GlobalException {

    @ExceptionHandler({ResourceNotFoundException.class})
    //@ResponseStatus(NOT_FOUND) // default return 200, thay doi neu chi dinh
    public ErrorResponse handleResourceNotFoundException(ResourceNotFoundException e, WebRequest request) throws IOException {
        log.error("errorMessage={}", e.getMessage());

        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setTimestamp(new Date());
        errorResponse.setPath(request.getDescription(false).replace("uri=", ""));
        errorResponse.setStatus(NOT_FOUND.value());
        errorResponse.setError("Not found");
        errorResponse.setMessage(e.getMessage());

        return errorResponse;
    }

    @ExceptionHandler({MethodArgumentNotValidException.class, MissingServletRequestParameterException.class, })
    public ErrorResponse handleMethodArgumentNotValidException(MethodArgumentNotValidException e, WebRequest request) throws IOException {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setTimestamp(new Date());
        errorResponse.setStatus(BAD_REQUEST.value());
        errorResponse.setPath(request.getDescription(false).replace("uri=", ""));

        String message = e.getMessage();
        if (e instanceof MethodArgumentNotValidException) {
            int start = message.lastIndexOf("[") + 1;
            int end = message.lastIndexOf("]") - 1;
            message = message.substring(start, end);
            errorResponse.setError("Invalid Payload");
            errorResponse.setMessage(message);
        }
//        else if (e instanceof MissingServletRequestParameterException) {
//            errorResponse.setError("Invalid Parameter");
//            errorResponse.setMessage(message);
//        } else if (e instanceof ConstraintViolationException) {
//            errorResponse.setError("Invalid Parameter");
//            errorResponse.setMessage(message.substring(message.indexOf(" ") + 1));
//        } else {
//            errorResponse.setError("Invalid Data");
//            errorResponse.setMessage(message);
//        }

        return errorResponse;
    }

}
