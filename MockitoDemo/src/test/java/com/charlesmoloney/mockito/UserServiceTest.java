package com.charlesmoloney.mockito;

//UserServiceTest.java
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import com.charlesmoloney.lombok.User;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {

 @Test
 void testRegisterUser_Success() {
     // Arrange
     IUserRepository mockRepo = mock(IUserRepository.class);
     IEmailService mockEmail = mock(IEmailService.class);

     when(mockRepo.findByEmail("test@example.com")).thenReturn(Optional.empty());

     UserService service = new UserService(mockRepo, mockEmail);

     // Act
     boolean result = service.registerUser("test@example.com", "Alice");

     // Assert
     assertTrue(result);
     ArgumentCaptor<User> userCaptor = ArgumentCaptor.forClass(User.class);

     verify(mockRepo).save(userCaptor.capture());
     verify(mockEmail).sendWelcomeEmail(userCaptor.capture());

     User savedUser = userCaptor.getAllValues().get(0);
     assertEquals("test@example.com", savedUser.getEmail());
     assertEquals("Alice", savedUser.getName());
 }

 @Test
 void testRegisterUser_UserAlreadyExists() {
     // Arrange
     IUserRepository mockRepo = mock(IUserRepository.class);
     IEmailService mockEmail = mock(IEmailService.class);

     when(mockRepo.findByEmail("existing@example.com"))
             .thenReturn(Optional.of(new User("existing@example.com", "Bob")));

     UserService service = new UserService(mockRepo, mockEmail);

     // Act
     boolean result = service.registerUser("existing@example.com", "Bob");

     // Assert
     assertFalse(result);
     verify(mockRepo, never()).save(any());
     verify(mockEmail, never()).sendWelcomeEmail(any());
 }
}
