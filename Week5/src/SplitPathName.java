public class SplitPathName {
	public static String[] splitPath(String s) {
		String[] components = new String[4];
		if (s.lastIndexOf("/") == s.length()){
			components[0] = s;
			components[1] = "";
			components[2] = "";
			components[3] = "";
		} else if(s.indexOf(".") != -1) {
			components[0] = s.substring(0, s.lastIndexOf("/") + 1);
			components[1] = s.substring(s.lastIndexOf("/") + 1);
			components[2] = s.substring(s.lastIndexOf("/")+1, s.lastIndexOf("."));
			components[3] = s.substring(s.lastIndexOf("."));
		}else{
			components[0] = s.substring(0, s.lastIndexOf("/") + 1);
			components[1] = s.substring(s.lastIndexOf("/") + 1);
			components[2] = components[1];
			components[3] = "";
		}
		return components;
	}

	public static void main(String args[]) {
		for (int i = 0; i < args.length; i++)
			System.out.println("File: " + splitPath(args[i])[1] + " Type: " + splitPath(args[i])[3] + " ["
					+ splitPath(args[i])[0] + "]");
	}
}