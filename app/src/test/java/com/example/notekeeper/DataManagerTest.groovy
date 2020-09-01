package com.example.notekeeper

class DataManagerTest extends GroovyTestCase {
    void testCreateNewNote() {
       DataManager  dm = DataManager.getInstance();
        final CourseInfo course=dm.getCourse("android_async");
        final String noteTitle="Test note title";
        final String noteText="This is the body of text my test note";
    }
}
