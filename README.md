# 🛠️ ElementUtil Class – Selenium Utility Methods

The `ElementUtil` class provides a collection of **reusable Selenium helper methods** to simplify web automation.  
This document lists all available methods, grouped by functionality, with short descriptions.

---

## 🔹 Click & Interaction Methods
- **`click`** – Standard click on a WebElement.  
- **`safeClick`** – Click with built-in wait and error handling.  
- **`javaScriptClickWithFallback`** – Attempts normal click, falls back to JS click.  
- **`javaScriptClick`** – Click using JavaScript execution.  
- **`contextClick`** – Right-click on an element.  
- **`contextClickAndPressEnter`** – Right-click + press Enter.  
- **`doubleClick`** – Performs a double-click action.  
- **`clickEvent`** – Clicks via JavaScript event dispatch.  
- **`waitUntilElementLoadsAndClick`** – Waits until visible and then clicks.

---

## 🔹 Keyboard & Robot Actions
- **`clickUpArrowMultipleTimes`** – Simulates pressing the up arrow multiple times.  
- **`refreshPageMultipleTimes`** – Refreshes the page multiple times.  
- **`scrollDown`** – Scrolls down by page.  
- **`scrollUp`** – Scrolls up by page.

---

## 🔹 Input & Text Handling
- **`clearAndInput`** – Clears an input field and types text.  
- **`input`** – Types text into a field.  
- **`enterStartDate`** – Inputs a start date into a date picker.  
- **`enterEndDate`** – Inputs an end date into a date picker.

---

## 🔹 Password & Randomization
- **`encryptPassword`** – Returns encrypted password (secure input).  
- **`generateRandomNumber`** – Generates a random number for test data.

---

## 🔹 Wait Utilities
- **`implicitWait`** – Sets global implicit wait.  
- **`explicitWait`** – Waits until element is visible.  
- **`explicitWaitUntilClickable`** – Waits until element is clickable.  
- **`waitForDomLoad`** – Waits for DOM ready state.

---

## 🔹 Dropdown & Select Utilities
- **`selectDropdownByText`** – Selects dropdown by visible text.  
- **`selectDropdownByIndex`** – Selects dropdown by index.  
- **`selectDropdownByValue`** – Selects dropdown by value attribute.  
- **`getDropdownOptions`** – Returns all dropdown options.  
- **`getDropdownOptionTexts`** – Returns option texts as a list.  
- **`selectMatOption`** – Selects Angular Material option by text.  
- **`selectMatOption_for_All`** – Selects multiple Angular Material options.  
- **`selectMultiple`** – Selects multiple options from a dropdown.  
- **`selectFromSearchableDropdown`** – Selects option in searchable dropdown.

---

## 🔹 Checkboxes, Toggles & Sliders
- **`selectCheckboxes`** – Selects one or multiple checkboxes.  
- **`setToggle`** – Sets toggle ON/OFF.  
- **`setSliderValue`** – Adjusts slider to a given value.

---

## 🔹 Window & Frame Handling
- **`switchToNewTabById`** – Switches to a new tab by ID.  
- **`switchToNewTab`** – Switches to the latest opened tab.  
- **`switchToParentTab`** – Switches back to parent tab.  
- **`switchToFrame`** – Switches to a frame by WebElement.  
- **`switchToDefault`** – Switches back to the main document.

---

## 🔹 Scrolling
- **`goToBottom`** – Scrolls to bottom of page.  
- **`scrollToElementBottom`** – Scrolls until the element is visible at bottom.

---

## 🔹 Drag, Drop & Advanced Interactions
- **`dragAndDrop`** – Performs drag-and-drop between elements.

---

## 🔹 File Upload & Download
- **`uploadFile`** – Uploads a file via input[type=file].  
- **`uploadFile1`** – Alternative file upload method.  
- **`uploadFileGeneric`** – Reusable generic upload method.  
- **`uploadFilesFromFolder`** – Uploads multiple files from a folder.  
- **`uploadFolder`** – Uploads an entire folder.  
- **`downloadFile`** – Initiates file download (basic click).  
- **`downloadFile (verify)`** – Initiates and verifies download.

---

## 🔹 Table & Accordion Handling
- **`searchAndClickInTable`** – Searches a table and clicks matching row.  
- **`expandAccordion`** – Expands an accordion section.  
- **`collapseAccordion`** – Collapses an accordion section.

---

## 🔹 Toast & Alert Handling
- **`captureToast`** – Captures toast/snackbar message.  
- **`handleAlert`** – Handles simple JavaScript alerts.  
- **`handleConfirmAlert`** – Handles confirm dialogs (OK/Cancel).  
- **`handlePromptAlert`** – Handles prompt dialogs with input.

---

## ✅ Usage
Import `ElementUtil` in your tests and call methods as needed:

```java
ElementUtil util = new ElementUtil(driver);
util.click(someElement);
util.selectDropdownByText(dropdownElement, "Bengaluru");
