package be.pxl.researchproject.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidMareCreatingException extends RuntimeException{
        public InvalidMareCreatingException(String message) {
            super(message);
        }
}
