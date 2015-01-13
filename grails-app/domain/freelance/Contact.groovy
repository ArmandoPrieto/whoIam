package freelance

class Contact {
	
	String name
	String email
	String message

    static constraints = {
		email email: true
    }
	static mapping = {
		message type: "text"
		
	 }
}
