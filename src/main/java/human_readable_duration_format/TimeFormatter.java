package human_readable_duration_format;

import java.util.List;

public class TimeFormatter {

    public static String formatDuration(int seconds) {

        String validation = inputValidation(seconds);
        if (!"Valid".equals(validation)) return validation;

        List<Integer> integers = calculateTimeToBreakpoints(seconds);
        return resultString(integers);

    }

    private static String inputValidation(int seconds) {
        if (seconds < 0) {
            return "negative value of time ";
        } else if (seconds == 0) {
            return "now";
        }
        return "Valid";
    }

    private static String singleOrPlural(int times, String prefix) {
        StringBuilder stringBuilder = new StringBuilder();
        if (times <= 1) {
            stringBuilder.append(times).append(" ").append(prefix);
        } else {
            stringBuilder.append(times).append(" ").append(prefix).append("s");
        }
        return stringBuilder.toString();
    }

    private static List<Integer> calculateTimeToBreakpoints(int seconds) {

        int years = 0;
        int days = 0;
        int hours = 0;
        int minutes = 0;

        years = seconds / 31536000;
        seconds = seconds % 31536000;

        if (seconds > 0) {
            days = seconds / 86400;
            seconds = seconds % 86400;
        }
        if (seconds > 0) {
            hours = seconds / 3600;
            seconds = seconds % 3600;
        }
        if (seconds > 0) {
            minutes = seconds / 60;
            seconds = seconds % 60;
        }
        return List.of(years, days, hours, minutes, seconds);
    }

    //TODO repair way of adding "and" and ","
    private static String resultString(List<Integer> list) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                count++;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                switch (i) {
                    case 0:
                        stringBuilder.append(singleOrPlural(list.get(i), "year"));
                        break;
                    case 1:
                        if (count > 2 && isaBoolean(list, i)) {
                            stringBuilder.append(", ");
                            count--;
                        } else if (count <= 2 && isaBoolean(list, i)) {
                            stringBuilder.append(" and ");
                            count--;
                        }

                        stringBuilder.append(singleOrPlural(list.get(i), "day"));
                        break;
                    case 2:

                        if (count > 2 && isaBoolean(list, i)) {
                            stringBuilder.append(", ");
                            count--;

                        } else if (count <= 2 && isaBoolean(list, i)) {
                            stringBuilder.append(" and ");
                            count--;

                        }

                        stringBuilder.append(singleOrPlural(list.get(i), "hour"));
                        break;
                    case 3:

                        if (count > 2 && isaBoolean(list, i)) {
                            stringBuilder.append(", ");
                            count--;


                        } else if (count <= 2 && isaBoolean(list, i)) {
                            stringBuilder.append(" and ");
                            count--;


                        }

                        stringBuilder.append(singleOrPlural(list.get(i), "minute"));
                        break;
                    case 4:

                        if (count > 2 && isaBoolean(list, i)) {
                            stringBuilder.append(", ");
                            count--;

                        } else if (count <= 2 && isaBoolean(list, i)) {
                            stringBuilder.append(" and ");
                            count--;

                        }
                        stringBuilder.append(singleOrPlural(list.get(i), "second"));
                        break;
                }
            }
//            System.out.println(count);

        }
        return stringBuilder.toString();
    }

    private static boolean isaBoolean(List<Integer> list, int i) {

        for (int j = 0; j < i; j++) {
            if (list.get(j) > 0) {
                return true;
            }
        }
        return false;
    }

}