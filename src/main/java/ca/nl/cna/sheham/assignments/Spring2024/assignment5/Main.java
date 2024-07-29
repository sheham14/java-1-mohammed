package ca.nl.cna.sheham.assignments.Spring2024.assignment5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> feedUrls = new ArrayList<>();
        final String end = "done";

        String url = "";

        System.out.println("Enter RSS feed URLs (type 'done' to finish):");
        while (!url.equals(end)) {
            url = scanner.nextLine();
            if (!url.equalsIgnoreCase(end)) {
                feedUrls.add(url);
            }
        }
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);

        for (String feedUrl : feedUrls) {
            try {
                executorService.scheduleAtFixedRate(new RSSFeedChecker(feedUrl), 0, 6, TimeUnit.SECONDS);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
