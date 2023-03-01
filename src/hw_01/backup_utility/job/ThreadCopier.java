package hw_01.backup_utility.job;

import hw_01.backup_utility.job.Copier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ThreadCopier implements Runnable{
    private final Path source;
    private final Path destination;

    public ThreadCopier(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }


    @Override
    public void run() {
        try {
            Files.walkFileTree(source, new Copier(source, destination));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
