# ktds-output-06
MAS Final Project

- 조원  
이홍석, 김종철, 박준표, 이영효



- 마이크로서비스 개발에 Spring Boot 사용.
- CI/CD 파이프라인에 AWS pipeline, Jenkins 사용.
- Kubernetes 또는 Docker Compose를 사용한 컨테이너 오케스트레이션
서버 접속 정보입니다.
인스턴스 네임 (stu-06-console)
ssh -i ktds.pem ubuntu@ec2-43-201-176-96.ap-northeast-2.compute.amazonaws.com

AWS 작업환경 설치 설치 (aws cli, eksctl, kubectl, docker, docker-compose)
1. repository 업데이트 :
  apt-get update -y

2. repository 설정 :
  sudo apt-get install unzip ca-certificates curl gnupg lsb-release

3. awscli 다운로드 :
  sudo curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"

4. awscli 인스톨 :
   sudo unzip awscliv2.zip
   ./aws/install 

5. aws eks 설치 :
   curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
   sudo mv /tmp/eksctl /usr/local/bin

6. kubectl 설치 :
   curl -o kubectl https://s3.us-west-2.amazonaws.com/amazon-eks/1.23.7/2022-06-29/bin/linux/amd64/kubectl
   chmod +x ./kubectl
   sudo install -o root -g root -m 0755 kubectl  /usr/local/bin/kubectl

7. docker gpg 키 등록 :
   curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo gpg --dearmor -o /usr/share/keyrings/docker-archive-keyring.gpg

8. docker repository 키등록 :
   echo "deb [arch=amd64 signed-by=/usr/share/keyrings/deocker-archive-keyring.gpg] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null

9. docker 엔진 설치 :
   sudo apt-get install docker-ce docker-ce-cli containerd.io

10. docker 그룹 생성 :
   sudo groupadd docker
   sudo usermod -aG docker ${USER}

11.  docker-compose  설치 :
    sudo curl -L "https://github.com/docker/compose/releases/download/1.27.4/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
	sudo chmod 777 /usr/local/bin/docker-compose
	sudo ln -s /usr/local/bin/docker-compose /usr/bin/docker-compose

12. 설치 확인 :
  ![2-1_result](https://github.com/TheWitcher3/ktds-output-06/assets/10649803/c03fa249-f4ae-4473-a909-f00e6b3c4e1f)



CodeBulid
코드 빌드 정책 만들때 s3 FullAccess 권한이 있어야 s3에 업로드 됨
![CodeBuildServiceRole](https://github.com/TheWitcher3/ktds-output-06/assets/10649803/ebfa1f40-1ff1-441c-ac22-5d802be9f706)




