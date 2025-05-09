public class Program8 {
    public static void pickResumes(Resume[] resumes, String jobType, int expirienceRequired) {
        for (int i = 0; i < resumes.length; i++) {
            if (resumes[i].getExpirience(jobType) >= expirienceRequired) {
                System.out.println(resumes[i].getName());
            }
        }
    }
}
