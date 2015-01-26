import java.util.zip.*;
import java.nio.file.*;
import java.io.*;

class Checksum{
	public static void main(String[] args) throws IOException{
		if (args.length == 1){
			byte[] bytes = Files.readAllBytes(Paths.get(args[0])); 
			CRC32 crc = new CRC32();
			crc.update(bytes);
			System.out.println(crc.getValue());
		}
		else{
			System.out.println("Error, needs 1 argument");
		}
	}
}