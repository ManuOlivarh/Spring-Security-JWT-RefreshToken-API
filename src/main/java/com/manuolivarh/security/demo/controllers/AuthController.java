package com.manuolivarh.security.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authentication")
public class AuthController {
	/*  @Autowired
	  AuthenticationManager authenticationManager;

	  @Autowired
	  UserRepository userRepository;

	  @Autowired
	  RoleRepository roleRepository;

	  @Autowired
	  PasswordEncoder encoder;

	  @Autowired
	  JwtUtils jwtUtils;

	  @Autowired
	  RefreshTokenService refreshTokenService;

	  @PostMapping("/signin")
	  public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

	    Authentication authentication = authenticationManager
	        .authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

	    SecurityContextHolder.getContext().setAuthentication(authentication);

	    UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();

	    String jwt = jwtUtils.generateJwtToken(userDetails);

	    List<String> roles = userDetails.getAuthorities().stream().map(item -> item.getAuthority())
	        .collect(Collectors.toList());

	    RefreshToken refreshToken = refreshTokenService.createRefreshToken(userDetails.getId());

	    return ResponseEntity.ok(new JwtResponse(jwt, refreshToken.getToken(), userDetails.getId(),
	        userDetails.getUsername(), userDetails.getEmail(), roles));
	  }*/
}
