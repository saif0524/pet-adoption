# Official Python runtime as a parent image
FROM python:3.12.6

# Set the working directory inside the container
WORKDIR /app

# Copy the requirements.txt file and install dependencies
COPY requirements.txt /app/
RUN pip install --no-cache-dir -r requirements.txt

# Copy the Python client and proto-generated files into the container
COPY pet-adoption-client.py /app/
COPY pet_adoption_pb2.py /app/
COPY pet_adoption_pb2_grpc.py /app/

# Set the environment variable to avoid buffering issues
ENV PYTHONUNBUFFERED=1

# Command to run the Python client
CMD ["python", "pet-adoption-client.py"]
