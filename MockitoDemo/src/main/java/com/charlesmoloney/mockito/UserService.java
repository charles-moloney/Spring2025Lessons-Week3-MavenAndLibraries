package com.charlesmoloney.mockito;

import com.charlesmoloney.lombok.User;

public class UserService implements IUserService {
    
    private final IUserRepository userRepository;
    private final IEmailService emailService;
    
    public UserService(IUserRepository userRepository, IEmailService emailService) {
        this.userRepository = userRepository;
        this.emailService = emailService;
    }
    
	public boolean registerUser(String email, String name) {
	    if (userRepository.findByEmail(email).isPresent()) {
            return false;
        }

        User newUser = new User(email, name);
        userRepository.save(newUser);
        emailService.sendWelcomeEmail(newUser);
        return true;		
	}

}
