package ghtk.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class FoundException extends RuntimeException{
    public FoundException(String message){
        super(message);
    }
}
