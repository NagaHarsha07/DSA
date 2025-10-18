@echo off
cd /d "C:\Users\DELL\OneDrive\DSA"
git add .
git commit -m "Auto commit on %date% %time%"
git push
pause
