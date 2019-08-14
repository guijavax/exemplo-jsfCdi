package br.com.exemplo;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean(name = "exemplo")
public class ExemploBean {
	
	public ExemploBean () {
		
	}
	@PostConstruct
	public void init() {
		
	}

	public String getHello() {
		return "Hello EveryOne";
	}
	
}
