package com.bobo.design.pattern.creational.builder.v2;

/**
 * 链式调用
 */
public class Course {
    private String courseName;

    private String coursePPT;

    private String courseVideo;

    private String courseArticle;

    private String courseQA;

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }

    public Course(CourseBuilder courseBuilder) {
        this.courseName = courseBuilder.courseName;
        this.coursePPT = courseBuilder.coursePPT;
        this.courseVideo = courseBuilder.courseVideo;
        this.courseArticle = courseBuilder.courseArticle;
        this.courseQA = courseBuilder.courseQA;
    }

    public static class CourseBuilder{
        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public String getCoursePPT() {
            return coursePPT;
        }

        public void setCoursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
        }

        public String getCourseVideo() {
            return courseVideo;
        }

        public void setCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
        }

        public String getCourseArticle() {
            return courseArticle;
        }

        public void setCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
        }

        public String getCourseQA() {
            return courseQA;
        }

        public void setCourseQA(String courseQA) {
            this.courseQA = courseQA;
        }

        private String courseName;

        private String coursePPT;

        private String courseVideo;

        private String courseArticle;

        private String courseQA;

        private Course course;

        public CourseBuilder buildCourseName(String courseName) {
            this.setCourseName(courseName);
            return this;
        }


        public CourseBuilder buildCoursePPT(String coursePPT) {
            this.setCoursePPT(coursePPT);
            return this;
        }


        public CourseBuilder buildCourseVideo(String courseVideo) {
            this.setCourseVideo(courseVideo);
            return this;
        }


        public CourseBuilder buildCourseArticle(String courseArticle) {
            this.setCourseArticle(courseArticle);
            return this;
        }


        public CourseBuilder buildCourseQA(String courseQA) {
            this.setCourseQA(courseQA);
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }
}
