# Hindu Chalisa, Mantra & Aarti App

This is an Android application that provides a collection of Hindu devotional content, including Chalisas, Mantras, and Aartis.

## Features

### Chalisa Section

- **Expandable UI**: Implemented an expandable "Chalisa" group in the navigation drawer.
- **Fragments**: Created dedicated Fragments and layout files for the following Chalisas:
  - Ganesh Chalisa
  - Shiv Chalisa
  - Hanuman Chalisa
  - Durga Chalisa

### Mantra Section

- **Expandable UI**: Implemented an expandable "Mantra" group in the navigation drawer.
- **Fragments**: Created dedicated Fragments and layout files for the following Mantras:
  - Hanuman Ashtak Mantra
  - Mahamritunjay Mantra
  - Narsimha Mantra
  - Madhurashtakam Mantra

### Aarti Section

A comprehensive "Aarti" section has been added to the application.

- **Expandable UI**: Implemented an expandable "Aarti" group in the navigation drawer.
- **New Fragments**: Created dedicated Fragments and layout files for the following Aartis:
  - Hanuman Aarti
  - Ganesh Aarti
  - Shiv Aarti
  - Durga Aarti
  - Krishna Aarti
  - Surya Aarti
  - Shani Aarti
  - Om Jai Jagadish Aarti
  - Ekadashi Aarti
  - Brihaspati Aarti
  - Lakshmi Aarti
  - Satyanarayan Aarti
  - Kaali Aarti

## Recent Updates

The following is a summary of recent changes and improvements made to the project:

### Build Fixes & Dependency Upgrades

- **Resolved Build Errors**: Fixed a "Duplicate resources" error that was preventing the project from building.
- **Dependency Modernization**: Upgraded numerous AndroidX and Material Design libraries to their latest stable versions. This improves compatibility, security, and performance.
- **SDK Update**: The project's `targetSdkVersion` has been updated to 34 to meet modern Android requirements. This included resolving manifest issues related to the `android:exported` attribute for Activities.

### Code Organization & Refactoring

- **String Resource Management**: The monolithic `strings.xml` file has been broken down into smaller, feature-specific files for better organization and maintainability:
  - `strings_app.xml` (for general app strings)
  - `strings_chalisa.xml`
  - `strings_mantra.xml`
  - `strings_aarti.xml`

- **Navigation**: Integrated all new Aarti fragments into the app's navigation graph, making them accessible from the main menu.
- **Bug Fixes**: Corrected errors related to missing drawable resources and layout typos to ensure the project builds successfully.
