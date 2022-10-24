package br.edu.ifsp.arq.prss6.apieconomarket.utils;

public class EndpointsConstMapping {
	
	public static class AuthEP {
		public static final String MAIN = "/auth";
		public static final String LOGIN = "/auth/login"; //Endpoint auto-configurado pelo Spring Security
		public static final String LOGOUT = "/logout";
		public static final String REFRESH_TOKEN = "/token/refresh";				
	}
	
	public class BrandEP {
		public static final String MAIN = "/brand";				
	}
	
	public class CategoryEP {
		public static final String MAIN = "/category";		
	}
	
	public class FieldUtilsEP {
		public static final String MAIN = "/fieldutils";
		public static final String UNITY = "/unity";
	}
	
	public class MarketEP {
		public static final String MAIN = "/market";
	}
	
	public class PermissionEP {
		public static final String MAIN = "/permission";
		public static final String BY_ID = "/{id}";
	}
	
	public class ProductEP {
		public static final String MAIN = "/product";		
	}
	
	public class RegisterEP {
		public static final String MAIN = "/register";
	}
	
	public class SearchEP {
		public static final String MAIN = "/search";
	}
	
	public class ShoppingEP {
		public static final String MAIN = "/shopping";
	}
	
	public class UserEP {
		public static final String MAIN = "/user";
		public static final String BY_ID = "/{id}";
	}
	
}
