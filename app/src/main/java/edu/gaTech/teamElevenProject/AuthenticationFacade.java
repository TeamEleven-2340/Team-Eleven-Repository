package edu.gaTech.teamElevenProject;

/**
 * Created by Admin on 2/2/2016.
 */
public interface AuthenticationFacade {
    /**
     * Handle login request
     * @param name name of the user
     * @param password password for the user
     * @return true if password matches user
     */
    boolean handleLoginRequest(String name, String password);
}