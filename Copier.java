import java.io.*;

class Copier{
	public static void main(String[] args) throws IOException{
		if (args.length == 2){
			FileInputStream fis = null;
			BufferedInputStream bis = null;
			FileOutputStream fos = null;
			BufferedOutputStream bos = null;
			try{
				byte[] buffer = new byte[1000];
				fis = new FileInputStream(args[0]);
				bis = new BufferedInputStream(fis);
				fos = new FileOutputStream(args[1]); 
				bos = new BufferedOutputStream(fos); 
				int numBytes;
				while ((numBytes= bis.read(buffer)) > 0) {
					bos.write(buffer, 0, numBytes);
				}
			} finally {
				bis.close();
				bos.close();
			}
		}
		else{
			System.out.println("Error, needs 2 arguments");
		}
	}
}