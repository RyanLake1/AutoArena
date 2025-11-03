import java.io.IOException;

public class RunAsAdminExample {
    public static void main(String[] args) throws IOException {
    Process myappProcess = Runtime.getRuntime().exec("powershell.exe Start-Process java.exe -Argument '-jar C:\\Users\\rnl\\my comp sci\\AutoArena Project\\AutoArenav2\\Mini Arena Inputs\\Mini_Inputs.java\' -verb RunAs");
    }
}   